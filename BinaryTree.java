
class Node
{
    int data;
    Node left;
    Node right;

    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree
{
    Node root;

    BinaryTree() //método construtor de classe
    {
        root = null;
    }

    //aqui não usarei o método recursivo de inserção, mas é perfeitamente possível usar 
    void insert(int key)
    {
        Node newNode = new Node(key);

        if(root == null)
        {
           root = newNode;
           return;
        }

        Node roda = root;
        while(true)
        {
            if(key < roda.data)
            {
                if(roda.left == null)
                {
                    roda.left = newNode;
                    break;
                }
                else
                {
                    roda = roda.left;
                }
            }
            else
            {
                if(roda.right == null)
                {
                    roda.right = newNode;
                    break;
                }
                else
                {
                    roda = roda.right;
                }
            }
        }

    }

    public void InOrder()
    {
        InOrder(root);
    }

    private void InOrder(Node root)
    {
        if(root != null)
        {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        System.out.print("Inorder: ");
        tree.InOrder();
    }
}

