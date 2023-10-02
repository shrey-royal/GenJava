class Resource {
    private int id;
    private boolean allocated;  //default value is false

    public Resource(int id) {
        this.id = id;
        this.allocated = false;
    }

    public int getId() {
        return id;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void allocate() {
        if (this.allocated) {
            throw new RuntimeException("Resource already allocated");
        } else {
            this.allocated = true;
        }
    }

    public void deallocate() {
        if (!this.allocated) {
            throw new RuntimeException("Resource already deallocated");
        } else {
            this.allocated = false;
        }
    }
}

class Process {
    private int id;
    private Resource[] resources;
    private int numResources;

    public Process(int id, int numResources) {
        this.id = id;
        this.numResources = numResources;
        this.resources = new Resource[numResources];
    }

    public int getId() {
        return id;
    }

    public void requestResource(Resource resource) {
        if(!resource.isAllocated()) {
            resource.allocate();
            for(int i = 0; i < numResources; i++) {
                if(this.resources[i] == null) {
                    this.resources[i] = resource;
                    break;
                }
            }
            System.out.println("Process " + id + " acquired Resource " + resource.getId());
        } else {
            System.out.println("Process " + id + " is waiting for Resource " + resource.getId());
        }
    }

    public void releaseResource(Resource resource) {
        for(int i=0; i<numResources; i++) {
            if(resources[i] != null && resources[i].equals(resource)) {
                resource.deallocate();
                resources[i] = null;
                System.out.println("Process " + id + " released Resource " + resource.getId());
            }
        }
    }

}

public class ResourceAllocationSimulation {
    public static void main(String[] args) {
        Resource r1 = new Resource(1);
        Resource r2 = new Resource(2);
        Resource r3 = new Resource(3);

        int numResources = 3;

        Process p1 = new Process(1, numResources);
        Process p2 = new Process(2, numResources);
        Process p3 = new Process(3, numResources);

        p1.requestResource(r1);
        p2.requestResource(r2);
        p3.requestResource(r3);

        // p1.releaseResource(r1);
        // p2.releaseResource(r2);
        // p3.releaseResource(r3);

        p1.requestResource(r2);
        p2.requestResource(r3);
        p3.requestResource(r1);

        p1.requestResource(r1);
        p2.requestResource(r2);
        p3.requestResource(r3);
    }
}