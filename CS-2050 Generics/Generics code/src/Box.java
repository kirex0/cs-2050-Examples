class Box<T>{
    T tThing;
    Box(T tThing){
        this.tThing = tThing;
    }

    T getMyT(){
        System.out.println("tThing = " + tThing);
        return this.tThing;
    }

}