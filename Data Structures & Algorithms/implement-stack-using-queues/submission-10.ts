class MyStack {
    stack :number[]
    constructor() {
        this.stack = new Array()
    }

    /**
     * @param {number} x
     * @return {void}
     */
    push(x: number): void {
        this.stack.push(x)
    }

    /**
     * @return {number}
     */
    pop(): number {
        return this.stack.pop()
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.stack[this.stack.length-1]
    }

    /**
     * @return {boolean}
     */
    empty(): boolean {
        return  this.stack.length>0? false :true
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = new MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */
