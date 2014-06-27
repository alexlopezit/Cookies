cordova.define("cordova/plugin/cookies", function(require, exports, module) {

	var exec = require('cordova/exec');

	module.exports = {

	    clear: function(successCallback, errorCallback) {
	        exec(successCallback, errorCallback, "Cookies", "clear", []);
	    },
	};
});