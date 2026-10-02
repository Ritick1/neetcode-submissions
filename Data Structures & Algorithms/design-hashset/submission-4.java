class MyHashSet {
    List<Integer> integer;
    public MyHashSet() {
       integer = new ArrayList<>();
    }
    
    public void add(int key) {
        integer.add(key);
    }
    
    public void remove(int key) {
        integer.removeIf(c-> c == key);
    }
    
    public boolean contains(int key) {
        return integer.contains(Integer.valueOf(key));
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */