class StockSpanner {

    Stack<Integer> indexStack;
    ArrayList<Integer> prices;

    public StockSpanner() {
        indexStack = new Stack<>();
        prices = new ArrayList<>();
    }

    public int next(int price) {

        prices.add(price);

        int i = prices.size() - 1;

        while (!indexStack.isEmpty() &&
                prices.get(indexStack.peek()) <= price) {
            indexStack.pop();
        }

        int span;

        if (indexStack.isEmpty()) {
            span = i + 1;
        } else {
            span = i - indexStack.peek();
        }

        indexStack.push(i);

        return span;
    }
}