Feature:Scénario d'ajout de produit sur MyTroc.fr
  Lorsque je souhaite ajouter un produit sur le site web MyTroc.fr, l'opération doit être effectuée correctement.
@myTroc
  Scenario:En tant qu'utilisateur, je souhaite ajouter un produit sur MyTroc.fr
    Given Utilisation visite la page d'accueil de MyTroc.fr
    And Utilisateur clique sur le lien "Se connecter"
    And Utilisateur se connecte et accède à son compte
    And Utilisateur clique sur le lien "Ajouter un produit"
    And Utilisateur remplit les informations du produit :
      | Nom du produit | Ensemble de papeterie |
      | Description du produit | Neuf et non utilisé |
      | Catégorie | Papeterie |
      | État | Neuf |
      | Prix | 20,00 € |
    And Utilisateur clique sur le bouton "Ajouter"
    When Utilisateur vérifie que le produit a été ajouté avec succès