package P14.tree;

public class binarytree18 {
    node18 root;

    public binarytree18() {
        root = null;
    }

    boolean isempty() {
        return root != null;
    }

//    void add(int data) {
//        if (!isempty()) {
//            root = new node18(data);
//        } else {
//            node18 current = root;
//            while (true) {
//                if (data > current.data) {
//                    if (current.right == null) {
//                        current.right = new node18(data);
//                        break;
//                    } else {
//                        current = current.right;
//                    }
//                } else if (data < current.data) {
//                    if (current.left == null) {
//                        current.left = new node18(data);
//                        break;
//                    } else {
//                        current = current.left;
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//
//    }
    boolean find(int data) {
        node18 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }
    void traversepreorder(node18 node){
        if (node != null){
            System.out.print(" " + node.data);
            traversepreorder(node.left);
            traversepreorder(node.right);
        }
    }
    void traversepostorder(node18 node){
        if (node != null){
            traversepostorder(node.left);
            traversepostorder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseinorder(node18 node){
        if (node != null){
            traverseinorder(node.left);
            System.out.print(" " + node.data);
            traverseinorder(node.right);
        }
    }
    node18 getsuccessor(node18 del){
        node18 sucessor = del.right;
        node18 sucessorparent = del;
        while (sucessor.left != null){
            sucessorparent = sucessor;
            sucessor = sucessor.left;
        }
        if (sucessor != del.right){
            sucessorparent.left = sucessor.right;
            sucessor.right = del.right;
        }
        return sucessor;
    }
    void delete(int data) {
        if (isempty()) {
            System.out.println("Tree is empty");
            return;
        }
        node18 parent = null;
        node18 current = root;
        boolean isLeftChild = false;
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Could not find data!");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            node18 successor = getsuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }

    public node18 addrecursive(node18 current, int data) {
        if (current == null) {
            return new node18(data);
        }

        if (data < current.data) {
            current.left = addrecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addrecursive(current.right, data);
        }

        return current;
    }
    void addrec(int data) {
        root = addrecursive(root, data);
    }
    public int min() {
        if (!isempty()) {
            throw new IllegalStateException("Tree is empty");
        }
        node18 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
    public int max() {
        if (!isempty()) {
            throw new IllegalStateException("Tree is empty");
        }
        node18 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
}

