$(document).ready(function () {
    $.datepicker.regional['bg'] = {
        closeText: 'Затвори', // set a close button text
        currentText: 'Днес', // set today text
        monthNames: ['Януари', 'Февруари', 'Март', 'Април', 'Май', 'Юни', 'Юли', 'Август', 'Септември', 'Октомври', 'Ноември', 'Декември'], // set month names
        monthNamesShort: ['Яну', 'Фев', 'Март', 'Апр', 'Май', 'Юни', 'Юли', 'Авг', 'Септ', 'Окт', 'Ноем', 'Дек'], // set short month names
        dayNames: ['Неделя', 'Понеделник', 'Вторник', 'Сряда', 'Четвъртък', 'Петък', 'Събота'], // set days names
        dayNamesShort: ['Нд', 'Пн', 'Вт', 'Ср', 'Чт', 'Пт', 'Сб'], // set short day names
        dayNamesMin: ['Н', 'П', 'В', 'С', 'Ч', 'Пт', 'Сб'], // set more short days names
        dateFormat: 'dd.mm.yy', // set format date
        firstDay: 1   // Default value is 0; Sunday 0; Monday 1; Tuesday 2; Wednesday 3; ...
    };

    $.datepicker.setDefaults($.datepicker.regional['bg']);
});

function initDatePickers() {
    let $datepickers = $("[data-type='datepicker']");
    $datepickers.each(function (index, element) {
        initDatepicker($(element));
    });
}

function initDatepicker($element) {
    let label = $element.siblings('label');
    let maxDate = $element.data('max-date');
    let minDate = $element.data('min-date');
    $element.datepicker({
        maxDate: maxDate,
        minDate: minDate,
        beforeShow: function (textbox, instance) {
            if ($(textbox).hasClass("modal-date")) {
                setTimeout(function () {
                    var newTop = $(textbox).offset().top - $(window).scrollTop() + $(textbox).height() + 2;
                    instance.dpDiv.css({
                        top: newTop + 'px',
                    });
                }, 20);
            }
        },
        onSelect: function () {
            if (label.length > 0) {
                $(label[0]).addClass('active');
            }
        }
    });
    $element.focusin(function () {
        if (label.length > 0) {
            $(label[0]).addClass('active');
        }
    });
    $element.focusout(function () {
        if (label.length > 0 && $element.val() == '') {
            $(label[0]).removeClass('active');
        }
    });
}

$(document).ready(function () {
    $("#filter-filing-date-from").datepicker(
        $.extend(
            {},
            $.datepicker.regional['bg_BG'],
            {
                maxDate: "0",
                changeMonth: true,
                changeYear: true,
                showOtherMonths: true,
                selectOtherMonths: false,
                dateFormat: 'dd.mm.yy',
                onSelect: function (date) {
                    $("#filter-filing-date-to").datepicker("option", "minDate", date);
                }
            }
        ));

    $("#filter-filing-date-to").datepicker(
        $.extend(
            {},
            $.datepicker.regional['bg_BG'],
            {
                maxDate: "0",
                changeMonth: true,
                changeYear: true,
                showOtherMonths: true,
                selectOtherMonths: false,
                dateFormat: 'dd.mm.yy',
                onSelect: function (date) {
                    $("#filter-filing-date-from").datepicker("option", "maxDate", date);
                }
            }
        ));

    $("#filter-sign-date-from").datepicker(
        $.extend(
            {},
            $.datepicker.regional['bg_BG'],
            {
                maxDate: "0",
                changeMonth: true,
                changeYear: true,
                showOtherMonths: true,
                selectOtherMonths: false,
                dateFormat: 'dd.mm.yy',
                onSelect: function (date) {
                    $("#filter-sign-date-to").datepicker("option", "minDate", date);
                }
            }
        ));

    $("#filter-sign-date-to").datepicker(
        $.extend(
            {},
            $.datepicker.regional['bg_BG'],
            {
                maxDate: "0",
                changeMonth: true,
                changeYear: true,
                showOtherMonths: true,
                selectOtherMonths: false,
                dateFormat: 'dd.mm.yy',
                onSelect: function (date) {
                    $("#filter-sign-date-from").datepicker("option", "maxDate", date);
                }
            }
        ));

});

