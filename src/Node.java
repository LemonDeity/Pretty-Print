public class Node {
    double value;
    Node right,left;

    public Node(double v){
        value = v;
        right = null;
        left = null;
    }

    public Node(double[] arr){
        value = 0;
        right = null;
        left = null;
        build(arr);
    }
    //This is for the insertion of numbers and sorting of input
    public void traverse(double num){
        //This means go left
        if (num <= value){
            if (left == null){
                left = new Node(num);
            }
            else{
                left.traverse(num);
            }
        }//This means it goes left; num > value
        else{
            if (right == null){
                right = new Node(num);
            }
            else{
                right.traverse(num);
            }
        }
    }

    public void build(double[] arr){
        value = arr[0];

        for (int i = 1; i < arr.length; i++) {
            traverse(arr[i]);
        }
    }

    public void pPrint(){
        pPrint(0);
    }
    //Go right first
    public void pPrint(int depth){

        if (right == null) {
        }else{
            right.pPrint(depth+1);
        }
        space(depth);
         if(left == null){
         }else{
             left.pPrint(depth+1);
         }

    }

    public void space(int spaces){
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println((int)value);
    }

    public void print(){
        System.out.print(value+" ");
        if (left != null)
            left.print();
        if(right != null)
            right.print();
    }

}
