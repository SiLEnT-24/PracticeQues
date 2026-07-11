#include<bits/stdc++.h>
using namespace std;

#define V 5

int graph[V][V]={
{0,1,0,1,0},
{1,0,1,1,1},
{0,1,0,0,1},
{1,1,0,0,1},
{0,1,1,1,0}
};

int path[V];

bool safe(int v,int pos){
if(graph[path[pos-1]][v]==0) return false;

for(int i=0;i<pos;i++)
if(path[i]==v) return false;

return true;
}

bool ham(int pos){
if(pos==V)
return graph[path[pos-1]][path[0]];

for(int v=1;v<V;v++){
if(safe(v,pos)){
path[pos]=v;
if(ham(pos+1)) return true;
path[pos]=-1;
}
}
return false;
}

int main(){

for(int i=0;i<V;i++)
path[i]=-1;

path[0]=0;

if(ham(1))
for(int i=0;i<V;i++)
cout<<path[i]<<" ";

}