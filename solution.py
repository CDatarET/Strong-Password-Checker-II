class Solution:
    def strongPasswordCheckerII(self, password):
        if len(password) < 8: return False

        l = False
        u = False
        d = False
        s = False
        p = None
        for c in password:
            if p is not None and c == p: return False
            elif c >= "a" and c <= "z": l = True
            elif c >= "A" and c <= "Z": u = True
            elif c >= "0" and c <= "9": d = True
            else: s = True

            p = c
        
        return l and u and d and s
