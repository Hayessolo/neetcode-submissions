class MinStack {
    arr: number[]
    arr2: number[]
    constructor() {
        this.arr = new Array();
        this.arr2 = new Array();
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val: number): void {
        this.arr.push(val)
        if (this.arr2.length >0){
            val = Math.min(val,this.arr2[this.arr2.length-1])
            this.arr2.push(val)
        }
        else{
            this.arr2.push(val)
        }
    }

    /**
     * @return {void}
     */
    pop(): void {
        this.arr2.pop()
        this.arr.pop()
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.arr[this.arr.length-1]
    }

    /**
     * @return {number}
     */
    getMin(): number {
        return this.arr2[this.arr2.length-1]
    }
}
