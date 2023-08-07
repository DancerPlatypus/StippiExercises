public class BST {
    public Node root;
    public BST(){
        root = null;
    }
    public void insert(int data){
        root = insert(root,data);
    }

    Node insert(Node root, int data)
    {
        if(root == null){
            root = new Node(data);
            return root;
        }
        else{
            if(data>root.key) root = insert(root.right,data);
            else  root = insert(root.left,data);

            return root;

        }


    }

    public void print (){
       print(root);
    }
    void print (Node root){
        if (root == null){
            return;
        }
        else {
            print(root.left);
            System.out.println(root.key);
            print(root.right);
        }
    }
}
