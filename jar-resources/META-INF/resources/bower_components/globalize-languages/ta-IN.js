(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["ta-IN"] = $.extend(true, {}, en, {
        name: "ta-IN",
        englishName: "Tamil (India)",
        nativeName: "தமிழ் (இந்தியா)",
        language: "ta",
        numberFormat: {
            groupSizes: [3,2],
            percent: {
                groupSizes: [3,2]
            },
            currency: {
                pattern: ["$ -n","$ n"],
                groupSizes: [3,2],
                symbol: "ரூ"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': "-",
                firstDay: 1,
                days: {
                    names: ["ஞாயிற்றுக்கிழமை","திங்கள்கிழமை","செவ்வாய்கிழமை","புதன்கிழமை","வியாழக்கிழமை","வெள்ளிக்கிழமை","சனிக்கிழமை"],
                    namesAbbr: ["ஞாயிறு","திங்கள்","செவ்வாய்","புதன்","வியாழன்","வெள்ளி","சனி"],
                    namesShort: ["ஞா","தி","செ","பு","வி","வெ","ச"]
                },
                months: {
                    names: ["ஜனவரி","பிப்ரவரி","மார்ச்","ஏப்ரல்","மே","ஜூன்","ஜூலை","ஆகஸ்ட்","செப்டம்பர்","அக்டோபர்","நவம்பர்","டிசம்பர்",""],
                    namesAbbr: ["ஜனவரி","பிப்ரவரி","மார்ச்","ஏப்ரல்","மே","ஜூன்","ஜூலை","ஆகஸ்ட்","செப்டம்பர்","அக்டோபர்","நவம்பர்","டிசம்பர்",""]
                },
                AM: ["காலை","காலை","காலை"],
                PM: ["மாலை","மாலை","மாலை"],
                patterns: {
                    d: "dd-MM-yyyy",
                    D: "dd MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dd MMMM yyyy HH:mm",
                    F: "dd MMMM yyyy HH:mm:ss",
                    M: "dd MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["ta-IN"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);