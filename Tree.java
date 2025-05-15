public class Tree {
    /**
     * The number of leaves on the tree.
     */
    private int numberOfLeaves;
    /**
     * The height of the tree in feet.
     */
    private int feetTall;
    /**
     * Constructor for the Tree class.
     *
     * @param theNumberOfLeaves
     * The number of leaves on the tree.
     * @param theFeetTall
     * The height of the tree in feet.
     */
    public Tree(final int theNumberOfLeaves, final int theFeetTall) {
        this.numberOfLeaves = theNumberOfLeaves;
        this.feetTall = theFeetTall;
    }
    /**
     * This method simulates the growth of a tree
     * by increasing the number of leaves
     * and height.
     */
    public void grow() {
        numberOfLeaves += 1000;
        feetTall += 3;
    }
    /**
     * Gets the number of leaves on the tree.
     * @return The number of leaves on the tree.
     */
    public int getNumberOfLeaves() {
        return this.numberOfLeaves;
    }
    /**
     * Gets the height of the tree.
     * @return The height of the tree.
     */
    public int getFeetTall() {
        return this.feetTall;
    }
}
