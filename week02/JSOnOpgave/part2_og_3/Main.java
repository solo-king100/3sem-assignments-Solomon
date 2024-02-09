package JSOnOpgave.part2_og_3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        String filePath = "account.json";
        try {
            List<CustomerList> customers = readJSONCustomers("C:\\Users\\mwesi\\School\\IdeaProjects\\3sem-assignments-Solomon\\week02\\JSOnOpgave\\part2_og_3\\account.json");
            printCustomerDTOs(customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




        public static List<CustomerList> readJSONCustomers(String filePath) throws IOException {
            Gson gson = new Gson();
            Type customerListType = new TypeToken<ArrayList<Customer>>() {
            }.getType();
            FileReader reader = new FileReader("account.json");
            return gson.fromJson(reader, customerListType);
        }

        public static void printCustomerDTOs(List<Customer> customers) {
            List<CustomerDTO> dtos = new ArrayList<>();
            for (Customer customer : customers) {
                CustomerDTO dto = new CustomerDTO(
                        customer.getFullName(),
                        customer.address.city,
                        String.valueOf(customer.address.zipCode),
                        customer.account.isActive
                );
                dtos.add(dto);
            }
        }
    }
}