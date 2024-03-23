class ExistenceOfASubstringInAStringAndItsReverse {
    public boolean isSubstringPresent(String s) {
        Set<String> set= new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
            String d =s.charAt(i+1)+""+s.charAt(i);
            if (set.contains(d)||s.charAt(i+1)==s.charAt(i)){
                return true;
            }
            set.add(s.charAt(i)+""+s.charAt(i+1));
        }
        return false;
    }
}