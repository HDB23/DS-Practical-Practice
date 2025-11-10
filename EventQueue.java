class Event
{
    int maxSize;
    String EventArray[];
    int front;
    int rear;
    int count;
    Event(int size)
    {
        maxSize = size;
        EventArray = new String[maxSize];
        front = 0; 
        rear = -1;
        count = 0;
    }
    public void addEvent(String Event)
    {
        if(rear == maxSize-1)
        {
            System.out.println("No event can be added it's already booked.");
        }
        else
        {
            rear = (rear+1) % maxSize;
            EventArray[rear] = Event;
            count++;
        }
    }
    public void completedEvent()
    {
        if(rear == -1)
        {
            System.out.println("No events can be added.");
        }
        else
        {
            System.out.println("The event " + EventArray[front] + " is completed.");
            front = (front + 1) % maxSize;
            count--;
        }
    }
    public void pendingEvent()
    {
        if(rear == -1)
        {
            System.out.println("No event can be added, No event is organised.");
        }
        else 
        {
            System.out.println("\nThe pending events are : ");
            for(int i=0; i<count; i++)
            {
                int idx = (front + i) % maxSize;
                System.out.print(EventArray[idx] + "\t");
            }
        }
    }
    public void cancelEvent(String eventName)
    {
        if(count == 0)
        {
            System.out.println("\nNo events to cancel.");
            return;
        }
        boolean found = false;
        int indexToRemove = -1;

        for(int i=0; i<count; i++)
        {
            int index = (front + i) % maxSize;
            if(EventArray[index].equalsIgnoreCase(eventName))
            {
                found = true;
                indexToRemove = index;
                break;
            }
        }
        if(!found)
        {
            System.out.println("\nEvent not found.");
            return;
        }
        int i = indexToRemove;
        while(i != rear)
        {
            int nextIndex = (i + 1) % maxSize;
            EventArray[i] = EventArray[nextIndex];
            i = nextIndex;
        }

        EventArray[rear] = null;
        rear = (rear - 1 + maxSize) % maxSize;
        count--;

        System.out.println("Event canceled : " + eventName);
    }
}

public class EventQueue {
    public static void main(String[] args)
    {
        Event e = new Event(5);
        e.pendingEvent();
        e.addEvent("Singing");
        e.addEvent("Dancing");
        e.addEvent("Acting");
        e.addEvent("Anchoring");
        e.addEvent("Playing");
        e.addEvent("Archery");
        e.pendingEvent();
        e.completedEvent();
        e.pendingEvent();
        e.cancelEvent("Acting");
        e.pendingEvent();
        e.completedEvent();
        e.pendingEvent();
    }
}