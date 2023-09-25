Feature:Scénario d'ajout de produit sur MyTroc.fr
  Lorsque je souhaite ajouter un produit sur le site web MyTroc.fr, l'opération doit être effectuée correctement.

  @myTroc
  Scenario:En tant qu'utilisateur, je souhaite ajouter un produit sur MyTroc.fr
    Given Utilisation visite la page d'accueil de MyTroc.fr
    And Utilisateur clique sur le lien Se connecter
    And Utilisateur se connecte et accède à son compte
    And Utilisateur clique sur le lien Je Propose Tab
    And Utilisateur clique sur la case Bon
    And Utilisateur choisit une catégorie pour le bon
    And Utilisateur saisit un titre concernant le bon
    And Utilisateur saisit une description concernant le bon
    And Utilisateur saisit un nombre de noisettes supérieur à zéro
    And Utilisateur clique sur Ajouter
    And Utilisateur clique sur le lien Mon Profil
    And Utilisateur clique sur le bouton "es Trocs
    Then Utilisateur voit ses trocs dans la liste