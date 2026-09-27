class Solution {
    public boolean isAnagram(String s, String t) {


char[] charArray = t.toCharArray();
boolean[] booleanArray = new boolean[t.length()];
for(int i = 0; i < t.length(); i++){
    char oneChar = charArray[i];
    if(s.contains(String.valueOf(oneChar))){
        booleanArray[i] = true;
    }else{
        booleanArray[i] = false;
    }
}

char[] charArray1 = s.toCharArray();
boolean[] booleanArray1 = new boolean[s.length()];
for(int i = 0; i < s.length(); i++){
    char oneChar = charArray1[i];
    if(t.contains(String.valueOf(oneChar))){
        booleanArray1[i] = true;
    }else{
        booleanArray1[i] = false;
    }
}

boolean tHasSAll = true;
for(int i = 0; i < booleanArray.length; i++){
    if (!booleanArray[i]) {
        tHasSAll = false;
        break;
    }
}

boolean sHasTAll = true;
for(int i = 0; i < booleanArray1.length; i++){
    if (!booleanArray1[i]) {
        sHasTAll = false;
        break;
    }
}


        boolean frequenciesMatch = true;
int[] frequency = new int[256];

if (s.length() == t.length()) {
    for (int i = 0; i < s.length(); i++) {
        frequency[s.charAt(i)]++;
        frequency[t.charAt(i)]--;
    }

    for (int count : frequency) {
        if (count != 0) {
            frequenciesMatch = false;
            break;
        }
    }
} else {
    frequenciesMatch = false;
}

       
        if(tHasSAll && sHasTAll && booleanArray.length == s.length() &&
                booleanArray1.length == t.length() && frequenciesMatch){
            return true;
        }


return false;     
    }
}
