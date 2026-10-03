class Solution {
    
    public String encode(List<String> strs) {
        StringBuffer stringBuffer = new StringBuffer();
        
        for(int i = 0; i < strs.size(); i++){
            stringBuffer.append(strs.get(i).length()+"#"+strs.get(i));
        }
        return stringBuffer.toString();
    }

    public List<String> decode(String str) {
        // 3#abc0#4#abcd;
        List<String> arrayList = new ArrayList<>();
        int i = 0;

    while (i < str.length()) {

        int delimiter = str.indexOf("#", i);

        int length = Integer.parseInt(
            str.substring(i, delimiter)
        );

        int start = delimiter + 1;

        int end = start + length;

        String value = str.substring(start, end);

        arrayList.add(value);

        i = end;
    }

    return arrayList;

       
    }
}
