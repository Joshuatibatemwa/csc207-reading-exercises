public static void printInorder(){
    printInorderH(root);
}


private <T> void printInorderH(Node<T> cur){
    if(cur!=null){
        printInorderH(cur.left);
        System.out.println(cur.value);
        printInorderH(cur.right);

    }
}
