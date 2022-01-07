# Mini-projet-Java

Le design pattern adopté est le MVC(Model-View-Controller)

# View
Les views représentent ce qui est affiché à l'utilisateur aucun traitement ne s'y fait.
Les views permettent cependant de récupérer les inputs de l'utilisateur pour réaliser une action donnée.

# Model
Ici on traite tout ce qui touche aux données.

# Model => Entity
Une entité est une classe qui décrit de quoi une information donnée est composée (EX: ce qui constitue un client)

# Model => DAL(Data Access Layer)
Les DALs sont des classes qui font l'accès aux données(SELECT,UPDATE,INSERT,etc...)
Elles ne font aucun traitement logique

# Model => BLL(Business Logic Layer)
Dans les classes BLL on définit la logique métier de l'application (traitement des données récupérées via les DALs)

# Controller
Les controlleurs jouent le rôle d'intermédiaire entre les views et les models.
Ils fournissent aux views l'information sollicitée en usant des BLL, et transmettent l'information à la BD via les BLL.

# L'information circule ainsi :
# Model <= => Controller <= => View


# NB: Cette séparation permet de facilité la modification et l'extension du code tout en assurant le maximum d'abstraction

