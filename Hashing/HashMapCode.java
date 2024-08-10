import java.util.*;

public class HashMapCode {
    
    static class HashMap<K,V> {  // generic
        private class Node{
            K key;
            V value;

            public Node(K key , V val) {
                this.key = key;
                this.value = val;
            }
        }

        private int n; // n 
        private int N;
        private LinkedList<Node> buckets[];  // N

        @SuppressWarnings("unchecked")
        public HashMap(K key, V val) {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di=0;

            for (Node node : ll) {
                if(node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }
        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket

            for(int i=0; i<oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.removeFirst();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V val) {
            int bi = hashFunction(key); // 0 -> 3
            int di = SearchInLL(key,bi);   // valid or -1

            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = val;
            } else {
                buckets[bi].add(new Node(key, val));
                n++;
            }

            double lamda = (double) n / N;
            if(lamda > 2.0) {
                reHash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // 0 -> 3
            int di = SearchInLL(key,bi);   // valid or -1

            if(di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // 0 -> 3
            int di = SearchInLL(key,bi);   // valid or -1

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 -> 3
            int di = SearchInLL(key,bi);   // valid or -1

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer > map = new HashMap<String,Integer>(null, null);
        map.put("India", 130);
        map.put("China",130);
        map.put("Us",100);
        map.put("Indonesia",60);
        map.put("Nepal",30);
        map.put("Brazil",20);

        System.out.println(map.containsKey("India"));
        ArrayList<String> arr = (map.keySet());

        for (String keys : arr) {
            System.out.println(keys);
        }

        map.remove("India");
        ArrayList<String> arr1 = (map.keySet());

        for (String keys : arr1) {
            System.out.println(keys);
        }
    }
}


