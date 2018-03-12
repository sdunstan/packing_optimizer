package com.stevedunstan.packing;

/**
 * Uses depth-first tree fit to find a solution to chicken.
 */
public class SearchFitter implements Fitter {

    static int expansionCount = 0;

    public void fit(int quantity, int[] result) {
        int[] values = nodeSearch(quantity);
        System.arraycopy(values, 0, result, 0, 3);
    }

    private int[] nodeSearch(int quantity) {
        expansionCount = 0;
        Node result = nodeSearch(new Node(quantity));
        System.out.println("Performed " + expansionCount + " expansions.");
        if (result != null)
            return result.values;
        else
            throw new IllegalArgumentException("illegal value");
    }

    private Node nodeSearch(Node node) {
        if (node.isGoal()) return node;

        for (Node child : node.expandChildren()) {
            Node result = nodeSearch(child);
            if (result != null && result.isGoal())
                return result;
        }

        return null;
    }

    private static class Node {
        final int[] SIZES = {20, 9, 6};
        int quantityRemaining;
        int[] values;

        public Node(int initialQuantity) {
            quantityRemaining = initialQuantity;
            values = new int[3];
        }

        private Node(Node parent, int i) {
            quantityRemaining = parent.quantityRemaining - SIZES[i];
            values = new int[3];
            System.arraycopy(parent.values, 0, values, 0, 3);
            values[i]++;
        }

        Node[] expandChildren() {
            SearchFitter.expansionCount++;
            Node[] children = new Node[0];
            if (quantityRemaining >= 20) {
                children = new Node[3];
                children[0] = new Node(this, 0);
                children[1] = new Node(this, 1);
                children[2] = new Node(this, 2);
            }
            else if (quantityRemaining >= 9) {
                children = new Node[2];
                children[0] = new Node(this, 1);
                children[1] = new Node(this, 2);

            }
            else if (quantityRemaining >= 6) {
                children = new Node[1];
                children[0] = new Node(this, 2);
            }

            return children;
        }

        public boolean isGoal() {
            return quantityRemaining == 0;
        }
    }

}
