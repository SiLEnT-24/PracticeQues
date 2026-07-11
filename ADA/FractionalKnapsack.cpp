#include<bits/stdc++.h>
using namespace std;

struct Item{
    int value,weight;
};

bool cmp(Item a,Item b){
    return (double)a.value/a.weight>(double)b.value/b.weight;
}

int main(){

    int n,W;
    cin>>n>>W;

    Item arr[n];

    for(int i=0;i<n;i++)
        cin>>arr[i].value>>arr[i].weight;

    sort(arr,arr+n,cmp);

    double profit=0;

    for(int i=0;i<n;i++){

        if(W>=arr[i].weight){

            profit+=arr[i].value;
            W-=arr[i].weight;

        }else{

            profit+=(double)arr[i].value*W/arr[i].weight;
            break;
        }
    }

    cout<<profit;
}