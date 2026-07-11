#include<bits/stdc++.h>
using namespace std;

struct Edge{
    int u,v,w;
};

bool cmp(Edge a,Edge b){
    return a.w<b.w;
}

int parent[100];

int find(int x){
    if(parent[x]==x)
        return x;
    return parent[x]=find(parent[x]);
}

void Union(int x,int y){
    parent[find(x)]=find(y);
}

int main(){

    int V,E;
    cin>>V>>E;

    Edge edge[E];

    for(int i=0;i<E;i++)
        cin>>edge[i].u>>edge[i].v>>edge[i].w;

    sort(edge,edge+E,cmp);

    for(int i=0;i<V;i++)
        parent[i]=i;

    int cost=0;

    for(int i=0;i<E;i++){

        if(find(edge[i].u)!=find(edge[i].v)){
            cout<<edge[i].u<<" "<<edge[i].v<<endl;
            cost+=edge[i].w;
            Union(edge[i].u,edge[i].v);
        }
    }

    cout<<"Minimum Cost="<<cost;
}