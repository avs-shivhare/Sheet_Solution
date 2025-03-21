class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mpp = defaultdict(list)
        for s in strs:
            sorted_str = "".join(sorted(s))
            mpp[sorted_str].append(s)
        return list(mpp.values())
            