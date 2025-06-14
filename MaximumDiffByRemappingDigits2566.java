public class MaximumDiffByRemappingDigits2566 {
 
   public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        char cMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                cMax = c;
                break;
            }
        }
        int mx = (cMax == ' ') ? num : Integer.parseInt(s.replace(cMax, '9'));
        char cMin = s.charAt(0);
        int mn = Integer.parseInt(s.replace(cMin, '0'));
        return mx - mn;
    }


}


