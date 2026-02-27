# Extract Method

Break a long method into smaller, well-named methods for clarity.(Fowler, 2nd Edition, p.106)

**Golden Tip:** Name the new function after its intent; extract even single-line code if it clarifies purpose.

**Note:** In the original JavaScript example, the author uses nested functions. Java does **not support nested functions**, so in this implementation the inner function is extracted as a separate private method.

Reference: [Refactoring Catalog – Extract Function](https://refactoring.com/catalog/extractFunction.html)