/*!
 * Globalize v1.2.3
 *
 * http://github.com/jquery/globalize
 *
 * Copyright jQuery Foundation and other contributors
 * Released under the MIT license
 * http://jquery.org/license
 *
 * Date: 2017-03-17T01:41Z
 */

// Core
module.exports = require("./globalize");

// Extent core with the following modules
require("./globalize/message");
require("./globalize/number");
require("./globalize/plural");

// Load after globalize/number
require("./globalize/currency");
require("./globalize/date");

// Load after globalize/number and globalize/plural
require("./globalize/relative-time");
require("./globalize/unit");
