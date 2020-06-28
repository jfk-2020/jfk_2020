class Race {
    constructor(promises){
        this.promises = promises;
        this.status = 'pending';
        this?.promises?.forEach(p => {
            if(p.then) {
                p.then((data)=>{
                    if(this.status === 'pending'){
                        this.status = 'fulfilled';
                        this.value = data;
                        this.cb && this.cb(this.value);
                    }
                }, (err)=>{
                    if(this.status === 'pending'){
                        this.status = 'rejected';
                        this.value = err;
                        this.errCb && this.errCb(this.value);
                    }
                })
            } else {
                if(this.status === 'pending'){
                    this.status = 'fulfilled';
                    this.value = p;
                    this.cb && this.cb(this.value);
                }
            }
        })

        return this;
    }
    then(cb, errCb){
        if(this.status === 'fulfilled'){
            cb(this.value);
        } else if(this.status === 'rejected') {
            errCb(this.value)
        } else {
            this.cb = cb;
            this.errCb = errCb;
        }
    }
}

const CustomPromise = {
    race(promises){
        return new Race(promises);
    }
}




// const promise1 = new Promise((resolve, reject) => {
//     setTimeout(resolve, 500, 'one');
// });
//
// const promise2 = new Promise((resolve, reject) => {
//     setTimeout(resolve, 100, 'two');
// });
//
// CustomPromise.race([promise1, promise2]).then((value) => {
//     console.log(value);
//
// }, (err)=>{
//     console.log('err', err);
// });
//
//
//
// var resolvedPromisesArray = [Promise.resolve(33), Promise.resolve(44)];
//
// var p = CustomPromise.race(resolvedPromisesArray);
// // immediately logging the value of p
// p.then((value) => {
//     console.log(value);
//     // Both resolve, but promise2 is faster
// }, (err)=>{
//     console.log('err', err);
// })