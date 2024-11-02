void breadth_first_search(int adj[][MAX], int visited[], int start){
    int queue[MAX], rear = -1, front = -1, i,

    for (k = 0; k<MAX; k++)
    visited[k] = 0;

    queue[++rear] = start;
    ++front;
    visited[start] = 1;

    while (rear >= front) {
        start = queue[front++]{
            start = queue[front++]
            printf("%d", start);
        }
    }

    //DFS Function

    void defth_first_search(int adj[][MAX], int visited[], int start)
    {
        int stack[MAX];
        int top = -1, i, k;
        for (k = 0; k < MAX; k++){
            visited[k] = 0;

            stack[++top] = start;

            while (top != -1){
                start = stack[top--];
                if(visited[start]==0){
                    printf("%d", start);
                    visited[start] = 1;
                }
            }

            for (i=0; i < MAX; i++){
                if (adj[start][i] && visited[i]){
                    stack(++top) = i;
                }

                int main(){
                    int visited[MAX] = {0};
                    int adj[MAX,MAX], i, j, option;

                    do {
                        printf("\n****Main Menu*****\n");
                        printf()
                        scanf("%d", &option){
                            case 1:
                            printf("\n Enter the adjacency matrix:\n");
                            for(i=0;i<MAX; i++)
                            for(j=0; j<M(AX; i++)
                            break;

                            case 2:
                            printf("BFS Traversal:");
                            breadth_first_search(adj, visited, 0);
                            printf("\n");
                            break;

                            case 3:
                            printf("DFS traversal:");
                            defth_first_search(adj, visited, 0);
                            printf("\n");
                            break;
                        }
                        while(option != 4));
                        getch();
                        return 0;
                    }
                }
            }
        }
    }
}