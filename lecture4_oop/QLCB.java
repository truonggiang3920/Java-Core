package lecture4_oop;

import java.util.List;

public class QLCB {
    public Worker themCanBo(String name, Integer age, String address, String gender, int rank){
        Worker wk = new Worker();
        wk.setName(name);
        wk.setAge(age);
        wk.setGender(gender);
        wk.setAddress(address);
        wk.setRank(rank);
        return wk;
    }
    public Engineer themCanBo1(String name, Integer age, String address, String gender, String trainingSector){
        Engineer en = new Engineer();
        en.setName(name);
        en.setAge(age);
        en.setGender(gender);
        en.setAddress(address);
        en.setTrainingSector(trainingSector);
        return en;
    }
    public Staff themCanBo2(String name, Integer age, String address, String gender, String work){
        Staff st = new Staff();
        st.setName(name);
        st.setAge(age);
        st.setGender(gender);
        st.setWork(work);
        return st;
    }
    public CanBo timCanBo(String name, List<CanBo> list){
        for(CanBo cb : list){
            if(cb.getName().equals(name)){
                return cb;
            }
        }
        return null;
    }
    public void thongTinCanBo(List<CanBo> list1){
        for (CanBo cb : list1) {
            System.out.println(cb.toString());
        }
    }
}
