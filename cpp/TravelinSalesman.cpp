#include<bits/stdc++.h>
using namespace std;

int graph[4][4]={
{0,10,15,20},
{10,0,35,25},
{15,35,0,30},
{20,25,30,0}
};

int ans=INT_MAX;

void tsp(int city,bool vis[],int count,int cost){

if(count==4){
ans=min(ans,cost+graph[city][0]);
return;
}

for(int i=0;i<4;i++){
if(!vis[i]){
vis[i]=true;
tsp(i,vis,count+1,cost+graph[city][i]);
vis[i]=false;
}
}
}

int main(){

bool vis[4]={0};

vis[0]=true;

tsp(0,vis,1,0);

cout<<"Minimum Cost="<<ans;
}