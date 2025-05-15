final class Main {
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
            Tree treeA = new Tree(1000, 10);
            Tree treeB = new Tree(2000, 20);
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
