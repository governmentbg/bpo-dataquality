$(function () {
    if ($("#authority-file-page").length > 0) {
        initDatePickers();
    }
});

$(document).on("change", "#authority-file-all-records", function (e) {
    var wrapper = $("#authority-file-filters-wrapper");
    if ($(this).is(':checked')) {
        $(wrapper).hide();
    } else {
        $(wrapper).show();
    }
});

$(document).on("click", "#generate-authority-file-btn", function (e) {
    $("#bpo-loader").dialog('open');
    $("#authority-file-action-btns").hide();
    $("#validation-errors-wrapper").empty();
    $("#epo-transfer-message-wrapper").empty();


    $.ajax({
        url: '/patents-exporter/authority-files/generate',
        type: "post",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(selectFilterCallParamsObject()),
        success: function (result) {
            if (result.indexOf('validation-errors') != -1) {
                $("#validation-errors-wrapper").html(result);
            } else {
                $("#generated-file-fields").replaceWith(result);
                $("#authority-file-action-btns").show();
            }

            $("#bpo-loader").dialog('close');
        },
        error: function () {
            //todo - show error message
            $("#bpo-loader").dialog('close');
        }
    });

});

$(document).on("click", "#download-authority-file-btn", function (e) {
    $("#bpo-loader").dialog('open');

    let callParams = {
        fileName: $("#generated-file-name").val(),
        fileContent: $("#generated-file-content").val()
    }

    $.ajax({
        url: '/patents-exporter/authority-files/download',
        type: "post",
        data: callParams,
        success: function (result) {
            var blob = new Blob([result]);
            var link = document.createElement('a');
            link.href = window.URL.createObjectURL(blob);
            link.download = callParams.fileName;
            link.click();
            link.remove();

            $("#bpo-loader").dialog('close');
        },
        error: function () {
            $("#bpo-loader").dialog('close');
        }
    });
});

$(document).on("click", "#send-authority-file-btn", function (e) {
    $("#bpo-loader").dialog('open');

    let callParams = {
        fileName: $("#generated-file-name").val(),
        fileContent: $("#generated-file-content").val(),
        isPartial: $("#generated-file-isPartial").val(),
        partialDateFrom: $("#generated-file-partialDateFrom").val(),
        partialDateTo: $("#generated-file-partialDateTo").val(),
    }

    $.ajax({
        url: '/patents-exporter/authority-files/epo-tranfer',
        type: "post",
        data: callParams,
        success: function (result) {
            if (result.indexOf('validation-errors') != -1) {
                $("#validation-errors-wrapper").html(result);
            } else {
                $("#epo-transfer-message-wrapper").html(result);
                clearFields();
            }

            $("#bpo-loader").dialog('close');
        },
        error: function () {
            $("#bpo-loader").dialog('close');
        }
    });
});

function clearFields() {
    $("#authority-file-action-btns").hide();

    $("#authority-file-all-records").prop("checked", false);
    $("#dateFrom-filter-input").val("");
    $("#dateTo-filter-input").val("");
    $("#authority-file-filters-wrapper").show();
    
    $("#generated-file-name").val("");
    $("#generated-file-content").val("");
    $("#generated-file-isPartial").val("");
    $("#generated-file-partialDateFrom").val("");
    $("#generated-file-partialDateTo").val("");
}

function selectFilterCallParamsObject() {
    return {
        isAllRecords: $("#authority-file-all-records").is(":checked"),
        dateFrom: $("#dateFrom-filter-input").val(),
        dateTo: $("#dateTo-filter-input").val()
    }
}
