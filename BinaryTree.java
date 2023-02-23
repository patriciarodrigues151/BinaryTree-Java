class Node
{
    //int data;
    //Node left;
    //Node right;

    public Node(int item)
    {
        int data = item;
        Node left = null;
        Node right = null;
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
    void insert(int data)
    {
        Node newNode = new Node(data);

        if(root == null)
        {
           root = newNode;
           return;
        }

        Node roda = root;
        while(true)
        {
            if(data < current.data)
            {
                if(data.left == null)
                {
                    data.left = newNode;
                }
            }
            else
            {
                if(data.right == null)
                {
                    data.right = newNode;
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
            InOrder(no.left);
            System.out.print(root.data + " ");
            InOrder(no.right);
        }
    }
}



