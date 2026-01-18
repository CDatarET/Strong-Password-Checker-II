class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) return(false);

        boolean l = false;
        boolean u = false;
        boolean d = false;
        boolean s = false;
        Character p = null;
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(p != null && c == p) return false;
            else if(c >= 'a' && c <= 'z') l = true;
            else if(c >= 'A' && c <= 'Z') u = true;
            else if(c >= '0' && c <= '9') d = true;
            else s = true;

            p = c;
        }

        return(l && u && d && s);
    }
}
