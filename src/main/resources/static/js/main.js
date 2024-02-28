$(document).on("change", "#filter-year", function (e) {
    let year = $(this).val();
    if (year) {
        $.ajax({
            url: '/patents-exporter/patents-publication/loadNumbersList',
            type: "post",
            data: {
                year: year
            },
            success: function (result) {
                $('#number-field-wrapper').html(result);
            },
            error: function () {
                console.log("An unexpected error occurred... Please try again.")
            }
        });
    }
});

$(document).on("click", "#generate-btn", function (e) {
    $("#bpo-loader").dialog('open');
    $("#generate-msg-success").hide();
    $("#generate-msg-fail").hide();
    $('#generate-msg-errors').hide();
    $('#download-link-wrapper').hide();
    $('#send-patents-wrapper').hide();
    $('#patents-file-path').val("");
    $("#epo-transfer-message-wrapper").empty();

    let number = $("#filter-number").val();
    let year = $("#filter-year").val();
    if (year && number) {
        $.ajax({
            url: '/patents-exporter/patents-publication/generate',
            type: "post",
            data: {
                number: number,
                year: year
            },
            success: function (result) {
                if (result === 'error') {
                    $('#generate-msg-fail').show();
                    $("#bpo-loader").dialog('close');
                } else {
                    if (result.endsWith("-errors.txt")) {
                        $('#generate-msg-errors').show();
                    } else {
                        $('#generate-msg-success').show();
                        $('#send-patents-wrapper').show();
                        $('#patents-file-path').val(result);
                    }
                    $('#download-url').attr('href', "/patents-exporter/patents-publication/download?path=" + result);
                    $('#download-link-wrapper').show();
                    $("#bpo-loader").dialog('close');
                }
            },
            error: function () {
                $('#generate-msg-fail').show();
                $("#bpo-loader").dialog('close');
            }
        });
    }
});

$(document).on("click", "#send-patents-btn", function (e) {
    $("#bpo-loader").dialog('open');

    let callParams = {
        path: $("#patents-file-path").val()
    }

    $.ajax({
        url: '/patents-exporter/patents-publication/epo-transfer',
        type: "post",
        data: callParams,
        success: function (result) {
            if (result.indexOf('validation-errors') != -1) {
                $("#validation-errors-wrapper").html(result);
            } else {
                $("#epo-transfer-message-wrapper").html(result);
                $("#generate-msg-success").hide();
                $("#generate-msg-fail").hide();
                $('#generate-msg-errors').hide();
                $('#download-link-wrapper').hide();
                $('#send-patents-wrapper').hide();
                $('#patents-file-path').val("");
            }

            $("#bpo-loader").dialog('close');
        },
        error: function () {
            $("#bpo-loader").dialog('close');
        }
    });
})