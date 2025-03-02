class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mpp = {}
        mpp2 = {}
        for si,ti in zip(s,t):
            if si in mpp:
                if mpp[si] != ti:
                    return False
            if ti in mpp2:
                if mpp2[ti] != si:
                    return False
            mpp[si] = ti
            mpp2[ti] = si
        return True
        