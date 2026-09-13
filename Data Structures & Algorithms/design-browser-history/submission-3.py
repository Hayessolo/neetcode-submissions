class Node:
    def __init__(self, url: str):
        self.url = url
        self.prev = None
        self.next = None

class BrowserHistory:

    def __init__(self, homepage: str):
        self.curr = Node(homepage)

    def visit(self, url: str) -> None:
        new_node = Node(url)
        # Link current node forward to new node
        self.curr.next = new_node
        new_node.prev = self.curr
        # Move current pointer to the new node (clears old forward chain!)
        self.curr = new_node

    def back(self, steps: int) -> str:
        # Step backward until hitting 0 steps or the start of history
        while steps > 0 and self.curr.prev:
            self.curr = self.curr.prev
            steps -= 1
        return self.curr.url

    def forward(self, steps: int) -> str:
        # Step forward until hitting 0 steps or the end of history
        while steps > 0 and self.curr.next:
            self.curr = self.curr.next
            steps -= 1
        return self.curr.url
