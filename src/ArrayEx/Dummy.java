//@RestController
//@RequestMapping("/users")
//public class UserController {
//	@Autowired
//	UserService userService;
//
//	@GetMapping("")
//	public List<User> list() {
//		return userService.listAllUser();
//	}
//================================================================
//	@Service
//	@Transactional
//	public class UserService {
//		@Autowired
//		private UserRepository userRepository;
//
//		public List<User> listAllUser() {
//			return userRepository.findAll();
//		}
//	==========================================================	
//		public interface UserRepository extends JpaRepository<User, Integer{
//		}
//===========================================
//		@Entity
//        @Table(name = "users")
//        public class User {
//            private int id;
//            private String firstName;
//            private String lastName;
//
//            public User() {
//            }
//
//            public User(int id, String firstName, String lastName) {
//                this.id = id;
//                this.firstName = firstName;
//                this.lastName = lastName;
//            }
//            @Id
//            @GeneratedValue(strategy = GenerationType.IDENTITY)
//            public int getId() {
//                return id;
//            }
//        //other setters and getters
//        }