final class Main {
    /**
     * The amount of trees.
     */
    private static final int TREE_AMOUNT_1 = 1000;
    /**
     * The amount of leaves on the tree.
     */
    private static final int TREE_AMOUNT_2 = 2000;
    /**
     * The amount of leaves on the tree.
     */
    private static final int TREE_HEIGHT_1 = 10;
    /**
     * The height of the tree in feet.
     */
    private static final int TREE_HEIGHT_2 = 20;
        /**
     * Private constructor to prevent instantiation.
     * @throws IllegalStateException Utility class.
     */
    private Main() {
        throw new IllegalStateException("Utility Class");
    }
    /**
     * @param args The command line arguments.
     * The x-coordinate of the balloon.
     */
    public static void main(final String[] args) {
            Tree treeA = new Tree(TREE_AMOUNT_1, TREE_HEIGHT_1);
            Tree treeB = new Tree(TREE_AMOUNT_2, TREE_HEIGHT_2);
            System.out.println("Tree A original leaves: "
             + treeA.getNumberOfLeaves
                            + " and is "
                             + treeA.getFeetTall + " feet tall.");
            System.out.println(
                            "Tree B original leaves: "
                             + treeB.getNumberOfLeaves
                                            + " and is "
                                            + treeB.getFeetTall
                                              + " feet tall.");
            System.out.println("Trees after growth:\n");
            treeA.grow();
            System.out.println("After growing, Tree A has "
                            + treeA.getNumberOfLeaves + " leaves and is "
                             + treeA.getFeetTall
                            + " feet tall.");
            treeB.grow();
            System.out.println("After growing, Tree B has "
             + treeB.getNumberOfLeaves
                            + " leaves and is " + treeB.getFeetTall
                            + " feet tall.");
    }
}
