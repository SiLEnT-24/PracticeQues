#include<bits/stdc++.h>
using namespace std;

int main(){

    int V;
    cin>>V;

    int graph[20][20];

    for(int i=0;i<V;i++)
        for(int j=0;j<V;j++)
            cin>>graph[i][j];

    bool selected[20]={0};

    selected[0]=true;

    int edges=0;

    while(edges<V-1){

        int min=999,x=0,y=0;

        for(int i=0;i<V;i++){

            if(selected[i]){

                for(int j=0;j<V;j++){

                    if(!selected[j]&&graph[i][j]){

                        if(min>graph[i][j]){

                            min=graph[i][j];
                            x=i;
                            y=j;

                        }
                    }
                }
            }
        }

        cout<<x<<" - "<<y<<" = "<<graph[x][y]<<endl;

        selected[y]=true;

        edges++;
    }
}