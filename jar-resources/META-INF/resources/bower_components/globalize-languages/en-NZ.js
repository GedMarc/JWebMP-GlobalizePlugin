(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["en-NZ"] = $.extend(true, {}, en, {
        name: "en-NZ",
        englishName: "English (New Zealand)",
        nativeName: "English (New Zealand)",
        numberFormat: {
            currency: {
                pattern: ["-$n","$n"]
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                AM: ["a.m.","a.m.","A.M."],
                PM: ["p.m.","p.m.","P.M."],
                patterns: {
                    d: "d/MM/yyyy",
                    D: "dddd, d MMMM yyyy",
                    f: "dddd, d MMMM yyyy h:mm tt",
                    F: "dddd, d MMMM yyyy h:mm:ss tt",
                    M: "dd MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["en-NZ"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);