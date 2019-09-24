//v8js
var strA = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./_+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
var strB = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz{}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";
var strConvert = gets()
var i = 0;
var ret = "";

for(i=0; i<strConvert.length; i++){
    if(strB.indexOf(strConvert.charAt(i)) > -1){
      ret += strA.charAt(strB.indexOf(strConvert.charAt(i)));
    }else{
      ret += strConvert.charAt(i);
    }
 }
print(ret);
