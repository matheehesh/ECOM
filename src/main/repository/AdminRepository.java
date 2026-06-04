@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, String> {
    List<AdminEntity> findByAdminId(String adminId);
}
