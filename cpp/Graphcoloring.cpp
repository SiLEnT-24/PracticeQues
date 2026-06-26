#include<bits/stdc++.h>
using namespace std;

#define V 4

bool safe(int v,int graph[V][V],int color[],int c){

for(int i=0;i<V;i++)
if(graph[v][i]&&color[i]==c)
return false;

return true;
}

bool solve(int graph[V][V],int m,int color[],int v){

if(v==V)
return true;

for(int c=1;c<=m;c++){

if(safe(v,graph,color,c)){

color[v]=c;

if(solve(graph,m,color,v+1))
return true;

color[v]=0;
}
}

return false;
}

int main(){

int graph[V][V]={
{0,1,1,1},
{1,0,1,0},
{1,1,0,1},
{1,0,1,0}
};

int color[V]={0};

if(solve(graph,3,color,0))
for(int i=0;i<V;i++)
cout<<"Vertex "<<i<<" -> Color "<<color[i]<<endl;

}