public class Solution {
    public bool StrongPasswordCheckerII(string password) {
        if(password.Length < 8) return(false);

        bool l = false;
        bool u = false;
        bool d = false;
        bool s = false;
        char p = '\0';
        for(int i = 0; i < password.Length; i++){
            char c = password[i];
            if(p != '\0' && c == p) return false;
            else if(c >= 'a' && c <= 'z') l = true;
            else if(c >= 'A' && c <= 'Z') u = true;
            else if(c >= '0' && c <= '9') d = true;
            else s = true;

            p = c;
        }

        return(l && u && d && s);
    }
}
