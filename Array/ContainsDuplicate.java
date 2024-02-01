class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSeen = new HashSet<>();
        for(int num:nums){
            if(!numSeen.add(num)) {
                return true;
            }
        }
        return false;

    }
}
