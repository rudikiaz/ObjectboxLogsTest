import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Index

@Entity
data class Demo (
        @Id
        var id : Long,
        @Index var name : String,
        @Index var surname : String
)