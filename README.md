Phonegap Cookies Plugin
=======

Phonegap/Cordova plugin that allows you to clear cookies of the webview. Use it for logging out the user, restart analytics session etc.

## Why a plugin?
On Phonegap `document.cookie` is empty, since index.html and all other files are loaded with `file://` protocol.
Phonegap manages cookies internally, but doesn't expose any function for clearing them.

## Installation
```
cordova plugin add https://github.com/alexlopezit/Cookies.git
```

## Usage
```javascript
var cookies;

cookies = cordova.require("cordova/plugin/cookies");

cookies.clear(function() {
  console.log("Cookies cleared!");
  location.reload();
});
```

## Limitations
I have tested with iOS 7.1.1, iOS 8.1.2, Android 4.4, Android 5.0.1, and Phonegap 3.1 and 3.5. Your mileage may vary on other versions.


                .---. .---. 
               :     : o   :    me want cookie!
           _..-:   o :     :-.._    /
       .-''  '  `---' `---' "   ``-.    
     .'   "   '  "  .    "  . '  "  `.  
    :   '.---.,,.,...,.,.,.,..---.  ' ;
    `. " `.                     .' " .'
     `.  '`.                   .' ' .'
      `.    `-._           _.-' "  .'  .----.
        `. "    '"--...--"'  . ' .'  .'  o   `.
        .'`-._'    " .     " _.-'`. :       o  :
      .'      ```--.....--'''    ' `:_ o       :
    .'    "     '         "     "   ; `.;";";";'
   ;         '       "       '     . ; .' ; ; ;
  ;     '         '       '   "    .'      .-'
  '  "     "   '      "           "    _.-'