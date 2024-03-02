package Domain;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNum;
    private List<StudentGroup> groups;


    public StudentSteam(int steamNum, List<StudentGroup> groups) {
        this.steamNum = steamNum;
        this.groups = groups;
    }

    public int getSteamNum() {
        return steamNum;
    }

    public void setSteamNum(int steamNum) {
        this.steamNum = steamNum;
    }

    public List<StudentGroup> getgroups() {
        return groups;
    }

    public void setgroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "steamNum=" + steamNum +
                ", groups=" + getgroups() +
                ", steamSize=" + groups.size() +
                "}";
    }

    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            int index = -1;

            @Override
            public boolean hasNext() {
                return index + 1 < groups.size();
            }

            @Override
            public StudentGroup next() {
                index++;
                if (index >= 0 && index < groups.size()) {
                    return groups.get(index);
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

}